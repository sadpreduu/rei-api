package br.com.api.reiapi.services;


import br.com.api.reiapi.model.Image;
import br.com.api.reiapi.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    public Image getImageById(Long id) {
        return imageRepository.findById(id).orElse(null);
    }

    public List<Image> getImageByCategory(String category) {
        return imageRepository.findByCategory(category);
    }

    public List<Image> getImageByName(String name) {
        return imageRepository.findByName(name);
    }

    public Image getRandomImage() {
        List<Image> images = imageRepository.findAll();
        if (images.isEmpty()) {
            return null;
        }
        Random random = new Random();
        return images.get(random.nextInt(images.size()));
    }

    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }

    public void deleteImage(Long id) {
        imageRepository.deleteById(id);
    }
}
