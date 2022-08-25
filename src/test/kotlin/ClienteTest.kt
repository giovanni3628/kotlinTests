import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {

    val cliente = Cliente(
        "Giovanni",
        "Sorocaba",
        "12345678",
    )

    @BeforeEach
    fun adicionarProd(){
        cliente.addCompra("margarina")
        cliente.addCompra("chocolate")
        cliente.addCompra("bala")
        cliente.addCompra("goma")
        cliente.addCompra("arroz")
    }

    @Test
    fun addCompra() {

        assertEquals(5, cliente.listaCompras.size)
        assertTrue(cliente.listaCompras.contains("arroz"))

    }

    @Test
    fun removerCompra() {
        cliente.removerCompra("bala")
        assertEquals(4, cliente.listaCompras.size)
        assertFalse(cliente.listaCompras.contains("bala"))
    }
}