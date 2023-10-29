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
        ArrayList<CropRow> fieldExpected = new ArrayList<>();

        CropRow cropRow1 = new CropRow();
        fieldExpected.add(cropRow1);
        field.addCropRow(cropRow1);


        assertArrayEquals(fieldExpected.toArray(), field.getCropRows().toArray());

    }

    @Test
    void addCropRow() {
        assertEquals(0,field.getCropRows().size());
        ArrayList<CropRow> fields = new ArrayList<>();

        CropRow row1 = new CropRow();
        fields.add(row1);
        field.addCropRow(row1);

        assertEquals(field.getCropRows(), field.getCropRows().size());
        assertEquals(row1, field.getCropRows().get(0));
    }
}