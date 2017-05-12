package simplecalculator;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)//선택적 테스트
@IncludeCategory(Rain.class) // 선택적 테스트
@SuiteClasses({ simplecalculatorTest.class, WeiredAddTest.class })
public class AllTests {

}
