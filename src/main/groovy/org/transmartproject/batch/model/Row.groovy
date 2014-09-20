package org.transmartproject.batch.model

import groovy.transform.ToString

/**
 * Represents a generic row of a data file
 */
@ToString(includes=['filename','index'])
class Row {
    String filename
    int index
    List<String> values

    String getValueAt(int index) {
        if (index >= values.size()) {
            return null
        }
        values[index]
    }
}
