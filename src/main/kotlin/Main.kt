import opennlp.tools.tokenize.SimpleTokenizer

fun main() {
    val text = "Hello world!"
    SimpleTokenizer.INSTANCE.tokenize(text).toList().also { println(it) }
}