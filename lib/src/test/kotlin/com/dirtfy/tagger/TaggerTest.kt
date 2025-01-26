import com.dirtfy.tagger.Tagger
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TaggerTest: Tagger {

    @Test
    fun `first part of TAG is class name`() {
        val (firstPart, _) = TAG.split('.')

        assertEquals("TaggerTest", firstPart)
    }

    @Test
    fun `second part of TAG is fourth stacktrace methodName`() {
        val (_, secondPart) = TAG.split('.')

        assertEquals("second part of TAG is fourth stacktrace methodName", secondPart)
    }

}