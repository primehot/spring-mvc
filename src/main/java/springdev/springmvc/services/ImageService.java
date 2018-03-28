package springdev.springmvc.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by oleh.tsyupaon 7/3/17.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
