fun main(){
    var umur: Int = 25
    if(umur >= 18){
        println("Anda suhda dewasa")
    } else {
        println("Anda belum dewasa")
    }

    when (umur) {
        0..17 -> println("Anda masih anak anak")
        else -> println("Anda sudah dewasa")
    }
}