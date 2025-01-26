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
        // Actually, target stacktrace index is 3 because
        // getStackTrace -> getTAG(interface) -> getTAG(class) -> (target), as I think.
        // I'm not sure, but empirically 'getTAG' method doesn't appear.
        // It may have some relation with build configuration related with classpath.
        // Anyway, so I test that it could find 'getTAG' rather target stacktrace.
        // ?? now getTAG appeard

        val (_, secondPart) = TAG.split('.')

        assertEquals("second part of TAG is fourth stacktrace methodName", secondPart)
    }

}