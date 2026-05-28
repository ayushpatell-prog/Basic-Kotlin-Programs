fun checkVowel(s: Char) {
    if (s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
        println("$s is a vowel")
    else
        println("$s is a consonant")
}
fun main() {
    val s = 'e'
    checkVowel(s)
}
