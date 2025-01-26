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

        // target index of stacktrace is decreased by 2
        // because when you called TAG 'getTAG' was in stacktrace for 2 times(this class and interface)
        // but not now
        val stackTrace = Thread.currentThread().stackTrace[1].methodName

        assertEquals(stackTrace, secondPart)
    }

}