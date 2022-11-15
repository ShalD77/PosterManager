import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void findAll() {
        PosterManager poster = new PosterManager(10);

        poster.add("overlord");
        poster.add("overlord 2");
        poster.add("overlord 3");
        poster.add("overlord 4");
        poster.add("overlord 5");


        String[] expected = {"overlord", "overlord 2", "overlord 3", "overlord 4", "overlord 5"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastAll() {
        PosterManager poster = new PosterManager(10);

        poster.add("overlord");
        poster.add("overlord 2");
        poster.add("overlord 3");
        poster.add("overlord 4");
        poster.add("overlord 5");


        String[] expected = {"overlord 5", "overlord 4", "overlord 3", "overlord 2", "overlord"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }



    @Test
    public void testFindLast1() {
        PosterManager poster = new PosterManager(1);

        poster.add("overlord");
        poster.add("overlord 2");
        poster.add("overlord 3");
        poster.add("overlord 4");
        poster.add("overlord 5");


        String[] expected = {"overlord 5"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }




    @Test
    public void testFindLastAll3() {
        PosterManager poster = new PosterManager();

        poster.add("overlord");
        poster.add("overlord 2");
        poster.add("overlord 3");
        poster.add("overlord 4");
        poster.add("overlord 5");


        String[] expected = {"overlord 5", "overlord 4", "overlord 3", "overlord 2", "overlord"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}

