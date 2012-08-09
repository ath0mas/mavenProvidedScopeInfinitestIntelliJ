package mavenProvidedScopeInfinitestIntelliJ;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;

/**
 * Unit test using provided dependency.
 */
public class ProvidedDependencyUseTest {

    @Test
    public void doTestUsingProvidedDependency() {
        HttpServletRequest request = mock(HttpServletRequest.class);

        when(request.isSecure()).thenReturn(true);

        assertTrue(request.isSecure());

        verify(request).isSecure();
    }

}
