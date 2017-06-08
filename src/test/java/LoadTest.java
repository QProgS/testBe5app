import com.developmentontheedge.be5.metadata.exception.ProjectLoadException;
import com.developmentontheedge.be5.metadata.model.Module;
import com.developmentontheedge.be5.metadata.model.base.BeModelCollection;
import com.developmentontheedge.be5.test.AbstractProjectIntegrationH2Test;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoadTest extends AbstractProjectIntegrationH2Test
{

    @Test
    public void testLoad() throws IOException, URISyntaxException, ProjectLoadException
    {
        assertEquals("testBe5app", injector.getProject().getAppName());

        BeModelCollection<Module> modules = injector.getProject().getModules();

        assertTrue(modules.get("core") != null);
    }
}
