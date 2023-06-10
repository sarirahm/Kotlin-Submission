package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val namaDepan = "Sari"
    val namaBelakang = "Rahmawati"
    val umur = 21
    //jika true maka single, jika false maka tidak single
    val status = false

    print("Halo namaku $namaDepan $namaBelakang, saat ini aku berusia $umur")

    if (status == true) {
        println(" dan aku masih single")
    } else {
        println(" dan aku punya ayang")
    }

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {

    print("Kami merupakan kelompok $groupId yang beranggotakan $groupMember dari sesi $session")

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {

    val groupMember = listOf("Sari ", "Pupu", "Bobi", "Yopi", "Rafie")
    val namaku = groupMember[0]
    return namaku
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val myGroupCount = 5
    var countOfGroup = mentor.size + myGroupCount
    return countOfGroup

}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(4, listOf("Sari ", "Pupu", "Bobi", "Yopi", "Rafie"), "Afternoon")

}