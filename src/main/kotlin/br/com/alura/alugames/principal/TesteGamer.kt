import br.com.alura.alugames.modelo.Gamer

fun main(){
    val gamer1 = Gamer("Orlean", "orleansilva60@hotmail.com")
    println(gamer1)

    val gamer2 = Gamer("orlean",
        "orleansilva60@hotmail.com",
        "07/07/1995",
        "mjorlean")
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "05/12/2000"
        it.usuario = "ninio300"

    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "jack"
    println(gamer1)
}