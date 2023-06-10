package id.infinitelearning.KotlinSubmission.exercise4

import java.util.*

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    print("Masukkan angka yang ingin dibagi: ")
    val scan = Scanner(System.`in`)
    var dibagi: Int = scan.nextInt()

    print("Masukkan angka yang menadi pembagi: ")
    val scan2 = Scanner(System.`in`)

    var pembagi: Int = scan2.nextInt()


    try {
        val result = dibagi / pembagi
        println("The result: $result")
    } catch (e: Exception) {
        println("Angka tidak dapat dibagi karena ${e.message}")
    }


}