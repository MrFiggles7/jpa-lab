package edu.wctc.jpalab.controller;

import edu.wctc.jpalab.entity.collection.Collector;
import edu.wctc.jpalab.entity.collection.CollectorPhoto;
import edu.wctc.jpalab.repo.collection.CollectorPhotoRepository;
import edu.wctc.jpalab.repo.collection.CollectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/collection/")
public class CollectionController {
    private CollectorPhotoRepository photoRepo;
    private CollectorRepository collectorRepo;

    @Autowired
    public CollectionController(CollectorRepository coll, CollectorPhotoRepository photo) {
        this.collectorRepo = coll;
        this.photoRepo = photo;
    }

    @GetMapping("/collectors")
    public List<Collector> getCollectors() {
        List<Collector> list = new ArrayList<>();
        collectorRepo.findAll().forEach(list::add);
        return list;
    }

    @GetMapping("/photos")
    public List<CollectorPhoto> getPhotos() {
        List<CollectorPhoto> list = new ArrayList<>();
        photoRepo.findAll().forEach(list::add);
        return list;
    }
}
