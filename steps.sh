
# SET JAVA VERSION 17
export JAVA_HOME="/usr/local/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home"
export PATH="$JAVA_HOME/bin:$PATH"

git clone https://github.com/fesh0r/fernflower.git
(cd fernflower && ./gradlew build)

# ---

# Compile and run a simple Kotlin program
kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar

# Decompile the Kotlin program using Fernflower
mkdir output
java -jar fernflower/build/libs/fernflower.jar -dgs=1 hello.jar output/

# Extract the decompiled source code
(cd output && unzip hello.jar -d decompiled_src)

# Compile the Java source code and run it
javac output/decompiled_src/HelloKt.java # creates HelloKt.class
java output/decompiled_src/HelloKt # runs HelloKt.class
