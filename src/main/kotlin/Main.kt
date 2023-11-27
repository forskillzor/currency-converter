import fuel.Fuel
import fuel.get
import kotlinx.coroutines.runBlocking

fun main() {
    println("Hello")

    runBlocking {
        val response = Fuel.get("https://api.freecurrencyapi.com/v1/currencies?apikey=fca_live_XeB8rwGp3TC5PTHGcCaTdNsNSyW0fyBOzoB6cPOz").body
        println(response)
    }
}