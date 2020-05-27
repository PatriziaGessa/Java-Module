package academy.boostprogramme.java.week8.set2.exercise2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TableBuilderTest {

    TableBuilder builder = new TableBuilder();

    @Test
    void build() {
        Furniture result = builder.build();

        Furniture expected = new Furniture("Table");
        String leg = "Leg";
        expected.getParts().addAll(List.of(leg, leg, leg, leg, "Surface"));
        assertEquals(expected, result);
    }
}