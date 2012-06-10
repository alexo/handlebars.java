package specs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CommentsTest.class, DelimitersTest.class,
    InterpolationTest.class, InvertedTest.class, SectionsTest.class })
public class SpecTests {

}