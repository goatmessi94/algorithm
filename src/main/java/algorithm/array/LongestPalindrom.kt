package algorithm.array

var left: Int = 0
var maxLen: Int = 0

fun extendpalindrome (str: String, current: Int, next: Int) {
    var currentIndex = current
    var nextIndex = next

    while (currentIndex >= 0 && nextIndex < str.length && str[currentIndex] == str[nextIndex]){
        currentIndex--
        nextIndex++
    }

    if (maxLen < nextIndex - currentIndex - 1) { //마이너스 1하는 이유글자 갯수 새기 위해서
        left = currentIndex + 1 // substring을 하기 위해서, 첫글자 포함
        maxLen = nextIndex - currentIndex - 1 // substring을 하기 위해서, 마지막 글자 포함 X
    }
}

fun longestpalindrome(s: String):String? {
    val len = s.length

    if (len < 2) return s

    for (current in 0 until len -1) {
        extendpalindrome(s, current, current + 1)
        extendpalindrome(s, current, current + 2)
    }

    return s.substring(left, left + maxLen)
}

fun main() {
    longestpalindrome("acbabcdd")
}