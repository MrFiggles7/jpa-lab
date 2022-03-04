package edu.wctc.jpalab.entity.collection;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
@Table(name="photo", schema="collection")
public class CollectorPhoto {
    @Id
    @Column(name="photo_id")
    private int id;

    @Column(name="photo_collector_id")
    private int collector_id;

    @Column(name="photo_filename")
    private String filename;

    @Column(name="photo_datestamp")
    private Timestamp datestamp;

    @Column(name="photo_visible")
    private char visible;
}
