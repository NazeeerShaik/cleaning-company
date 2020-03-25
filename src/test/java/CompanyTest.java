import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class CompanyTest {


    @Test
    public void shouldAssignJob() {
        Cleaner cleaner = new Cleaner();
        Company company = new Company(Collections.singletonList(cleaner));

        company.assign(cleaner, new Location("Chennai"), Job.CUSTODIAN);

        Assert.assertEquals(cleaner.getLocation(), new Location("Chennai"));
        Assert.assertEquals(cleaner.getJobType(), Job.CUSTODIAN);
    }

    @Test
    public void shouldReturnListOfEmployees() {
        Cleaner cleaner1 = new Cleaner();
        Cleaner cleaner2 = new Cleaner();
        Company company = new Company(asList(cleaner1, cleaner2));

        company.assign(cleaner1, new Location("Chennai"), Job.HOUSEKEEPER);
        company.assign(cleaner2, new Location("Delhi"), Job.CUSTODIAN);
        List<Cleaner> expected = company.getCleanersList();

        Assert.assertEquals(expected, Arrays.asList(cleaner1, cleaner2));

    }

    @Test
    public void shouldReturnListOfJobs() {
        Cleaner cleaner1 = new Cleaner();
        Cleaner cleaner2 = new Cleaner();
        Company company = new Company(asList(cleaner1, cleaner2));

        company.assign(cleaner1, new Location("Chennai"), Job.HOUSEKEEPER);
        company.assign(cleaner2, new Location("Delhi"), Job.CUSTODIAN);
        List<Job> expected = company.getJobTypesList();

        Assert.assertEquals(expected, new ArrayList<>(Arrays.asList(Job.HOUSEKEEPER, Job.CUSTODIAN)));
    }
}