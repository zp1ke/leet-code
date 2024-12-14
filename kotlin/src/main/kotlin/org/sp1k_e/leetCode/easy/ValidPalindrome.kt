package org.sp1k_e.leetCode.easy

// https://neetcode.io/problems/is-palindrome
class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val chars = s.lowercase().toCharArray().filter { char -> char in '0'..'9' || char in 'a'..'z' }
        var left = 0
        var right = chars.lastIndex
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false
            }
            left += 1
            right -= 1
        }
        return true
    }
}