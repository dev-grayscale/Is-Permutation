import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void isPermutationV1() {
    Assertions.assertFalse(Main.isPermutationV1(null, null));
    Assertions.assertFalse(Main.isPermutationV1(null, ""));
    Assertions.assertFalse(Main.isPermutationV1(null, "   "));
    Assertions.assertFalse(Main.isPermutationV1("", null));
    Assertions.assertFalse(Main.isPermutationV1("   ", null));
    Assertions.assertFalse(Main.isPermutationV1("", ""));
    Assertions.assertFalse(Main.isPermutationV1("  ", ""));
    Assertions.assertFalse(Main.isPermutationV1("", "  "));
    Assertions.assertFalse(Main.isPermutationV1("   ", "  "));
    Assertions.assertFalse(Main.isPermutationV1("   ", "  "));
    Assertions.assertFalse(Main.isPermutationV1("test", "  "));
    Assertions.assertFalse(Main.isPermutationV1("test", "tester"));
    Assertions.assertFalse(Main.isPermutationV1("Another example 1234599", "Another example 123459"));
    Assertions.assertFalse(Main.isPermutationV1("Hi!", "Hi?"));
    Assertions.assertFalse(Main.isPermutationV1("hi!", "Hi?"));
    Assertions.assertFalse(Main.isPermutationV1("abb", "acc"));

    Assertions.assertTrue(Main.isPermutationV1("dog", "god"));
    Assertions.assertTrue(Main.isPermutationV1("Hi!", "Hi!"));
    Assertions.assertTrue(Main.isPermutationV1("hi!", "Hi!"));
    Assertions.assertTrue(Main.isPermutationV1("abcdef", "fedcba"));
    Assertions.assertTrue(Main.isPermutationV1("mate", "tame"));
    Assertions.assertTrue(Main.isPermutationV1("mate", "TAME"));
    Assertions.assertTrue(Main.isPermutationV1("Testing this logic", "cigol his Ttesting"));
    Assertions.assertTrue(Main.isPermutationV1("Another example 1234599", "Another 99example 12345"));
  }

  @Test
  void isPermutationV2() {
    Assertions.assertFalse(Main.isPermutationV2(null, null));
    Assertions.assertFalse(Main.isPermutationV2(null, ""));
    Assertions.assertFalse(Main.isPermutationV2(null, "   "));
    Assertions.assertFalse(Main.isPermutationV2("", null));
    Assertions.assertFalse(Main.isPermutationV2("   ", null));
    Assertions.assertFalse(Main.isPermutationV2("", ""));
    Assertions.assertFalse(Main.isPermutationV2("  ", ""));
    Assertions.assertFalse(Main.isPermutationV2("", "  "));
    Assertions.assertFalse(Main.isPermutationV2("   ", "  "));
    Assertions.assertFalse(Main.isPermutationV2("   ", "  "));
    Assertions.assertFalse(Main.isPermutationV2("test", "  "));
    Assertions.assertFalse(Main.isPermutationV2("test", "tester"));
    Assertions.assertFalse(Main.isPermutationV2("Another example 1234599", "Another example 123459"));
    Assertions.assertFalse(Main.isPermutationV2("Hi!", "Hi?"));
    Assertions.assertFalse(Main.isPermutationV2("hi!", "Hi?"));
    Assertions.assertFalse(Main.isPermutationV2("abb", "acc"));

    Assertions.assertTrue(Main.isPermutationV2("dog", "god"));
    Assertions.assertTrue(Main.isPermutationV2("Hi!", "Hi!"));
    Assertions.assertTrue(Main.isPermutationV2("hi!", "Hi!"));
    Assertions.assertTrue(Main.isPermutationV2("abcdef", "fedcba"));
    Assertions.assertTrue(Main.isPermutationV2("mate", "tame"));
    Assertions.assertTrue(Main.isPermutationV2("mate", "TAME"));
    Assertions.assertTrue(Main.isPermutationV2("Testing this logic", "cigol his Ttesting"));
    Assertions.assertTrue(Main.isPermutationV2("Another example 1234599", "Another 99example 12345"));
  }
}
