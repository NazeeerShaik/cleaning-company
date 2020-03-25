import org.junit.Assert;
import org.junit.Test;

public class CleanerTest {
    @Test
    public void shouldDisplayInfo() {
        Cleaner cleaner = new Cleaner();

        cleaner.setLocation(new Location("Chennai"));
        cleaner.setJobType(Job.HOUSEKEEPER);

        Assert.assertEquals(cleaner.getLocation(), new Location("Chennai"));
        Assert.assertEquals(cleaner.getJobType(), Job.HOUSEKEEPER);
    }
}
