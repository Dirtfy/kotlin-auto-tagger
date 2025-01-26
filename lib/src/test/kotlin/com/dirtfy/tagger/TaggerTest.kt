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
    fun `second part of TAG is second stacktrace methodName`() {
        // Actually, target stacktrace index is 3 because
        // getStackTrace -> getTAG -> getTAG -> (target), as I think.
        // I'm not sure, but empirically 'getTAG' method doesn't appear.
        // It may have some relation with build configuration related with classpath.
        // Anyway, so I test that it could find 'getTAG' rather target stacktrace.

        val (_, secondPart) = TAG.split('.')

        assertEquals("getTAG", secondPart)
    }

}