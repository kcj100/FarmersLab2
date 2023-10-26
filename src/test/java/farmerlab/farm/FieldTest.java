package farmerlab.farm;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    private Field field;

    @BeforeEach
    public void setUp(){
        field = new Field();
    }

    @Test
    void getCropRows() {
        assertEquals(0,field.getCropRows().size());
        ArrayList<CropRow> field = new ArrayList<>();

        CropRow cropRow1 = new CropRow();
        field.add(cropRow1);

        assertArrayEquals(field.toArray(), field.getCropRows().toArray());

    }

    @Test
    void addCropRow() {
        assertEquals(0,field.getCropRows().size());
        ArrayList<CropRow> fields = new ArrayList<>();

        CropRow row1 = new CropRow();
        fields.add(row1);

        assertEquals(fields.size(), field.getCropRows().size());
        assertEquals(horse1, field.getCropRows().get(0));
    }
}