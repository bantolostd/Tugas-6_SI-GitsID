class Pembulatan {
    // inisialisasi variabel class
    var bilangan: Double = 0.0
        // getter
        get() = field
        // setter
        set(value) {
            // menampung bilangan setelah dibulatkan
            var temp: Int = value.toInt()
            // untuk mendapatkan bilangan di belakang koma --> misal value = 1.36; value.toInt() = 1 --> 1.36 - 1 = 0.36
            var koma: Double = value - value.toInt()
            if(koma >= 0.5)
            // membulatkan bilangan desimal positif
                if(value > 0.0) temp += 1
                // membulatkan bilangan desimal negatif
                else temp -= 1
            // else // tidak perlu diubah, karena temp sudah membulatkan ke bawah dengan to.Int()
            // menyimpan bilangan yang sudah dibulatkan ke dalam variabel class
            field = temp.toDouble()
        }

}
fun main(args: Array<String>) {
    // pembuatan object bil1 dengan class Pembulatan
    val bil1 = Pembulatan()
    // set nilai angka
    bil1.bilangan = 1.36
    // get nilai angka
    println("${bil1.bilangan}")

    // pembuatan object bil2 dengan class Pembulatan
    val bil2 = Pembulatan()
    // set nilai angka
    bil2.bilangan = -3.27
    // get nilai angka
    println("${bil2.bilangan}")
}
