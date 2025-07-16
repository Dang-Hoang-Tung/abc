@Target(AnnotationTarget.CLASS)
annotation class AutoToString


class AutoToStringProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {
        val symbols = resolver.getSymbolsWithAnnotation(AutoToString::class.qualifiedName!!)
        symbols.filterIsInstance<KSClassDeclaration>().forEach { classDecl ->
            val className = classDecl.simpleName.asString()
            val packageName = classDecl.packageName.asString()
            val file = codeGenerator.createNewFile(
                Dependencies(false), packageName, "${className}ToString"
            )

            val props = classDecl.getAllProperties().map { it.simpleName.asString() }

            file.bufferedWriter().use { writer ->
                writer.write("package $packageName\n\n")
                writer.write("fun $className.autoToString(): String = ")
                writer.write("\"$className(${props.joinToString { "$it=\$${it}" }})\"\n")
            }
        }
        return emptyList()
    }
}
