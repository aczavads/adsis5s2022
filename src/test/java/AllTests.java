import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import adsis5s2022.estoque.TestesComEstoque;
import aula20220304.calculadora.TestesIntrodut√≥rios;
import junit.extensions.TestSetup;

@RunWith(Suite.class)
@SuiteClasses({TestesComEstoque.class, TestesIntrodut√≥rios.class})
public class AllTests {

}
