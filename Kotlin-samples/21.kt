// Compiler Plugin or Symbol Processor (KSP) — Advanced

// Involves metaprogramming, codegen, Gradle setup for KSP, and cross-module coordination.


@Target(AnnotationTarget.CLASS)
annotation class AutoRepo

// Usage
@AutoRepo
data class User(val id: Int, val name: String)

class AutoRepoProcessor(...) : SymbolProcessor {
    override fun process(resolver: Resolver): List<KSAnnotated> {
        resolver.getSymbolsWithAnnotation(AutoRepo::class.qualifiedName!!)
            .filterIsInstance<KSClassDeclaration>()
            .forEach { classDecl ->
                val name = classDecl.simpleName.asString()
                val pkg = classDecl.packageName.asString()
                val file = codeGenerator.createNewFile(
                    Dependencies(false), pkg, "${name}Repository"
                )

                file.bufferedWriter().use { writer ->
                    writer.write(\"\"\"\npackage $pkg\n\nclass ${name}Repository {\n    fun findAll(): List<$name> = TODO()\n    fun save(entity: $name): Unit = TODO()\n}\n\"\"\")
                }
            }

        return emptyList()
    }
}
