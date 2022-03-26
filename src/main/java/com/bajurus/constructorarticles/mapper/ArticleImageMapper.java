package com.bajurus.constructorarticles.mapper;

import com.bajurus.constructorarticles.model.ArticleImage;
import com.bajurus.constructorarticles.model.Image;
import com.bajurus.constructorarticles.model.dto.ArticleImageDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

@Component
public class ArticleImageMapper {

    public ArticleImage toEntity(ArticleImageDTO articleImageDTO) {
        ArticleImage articleImage = new ArticleImage();
        articleImage.setFio(articleImageDTO.getFio());
        articleImage.setEmail(articleImageDTO.getEmail());
        articleImage.setAuthor(articleImageDTO.getAuthor());
        articleImage.setAnnotation(articleImageDTO.getAnnotation());
        articleImage.setKeywords(articleImageDTO.getKeywords());
        articleImage.setType(articleImageDTO.getType());
        articleImage.setDate(LocalDateTime.now());
        ArrayList<Image> resources = articleImageDTO.getResources();
        if (Objects.nonNull(resources)) {
            if (resources.size() >= 1) {
                articleImage.setResource0(Objects.nonNull(articleImageDTO.getResources().get(0)) ? articleImageDTO.getResources().get(0) : null);
            }
            if (resources.size() >= 2) {
                articleImage.setResource1(Objects.nonNull(articleImageDTO.getResources().get(1)) ? articleImageDTO.getResources().get(1) : null);
            }
            if (resources.size() >= 3) {
                articleImage.setResource2(Objects.nonNull(articleImageDTO.getResources().get(2)) ? articleImageDTO.getResources().get(2) : null);
            }
            if (resources.size() >= 4) {
                articleImage.setResource3(Objects.nonNull(articleImageDTO.getResources().get(3)) ? articleImageDTO.getResources().get(3) : null);
            }
            if (resources.size() >= 5) {
                articleImage.setResource4(Objects.nonNull(articleImageDTO.getResources().get(4)) ? articleImageDTO.getResources().get(4) : null);
            }
            if (resources.size() >= 6) {
                articleImage.setResource5(Objects.nonNull(articleImageDTO.getResources().get(5)) ? articleImageDTO.getResources().get(5) : null);
            }
            if (resources.size() >= 7) {
                articleImage.setResource6(Objects.nonNull(articleImageDTO.getResources().get(6)) ? articleImageDTO.getResources().get(6) : null);
            }
            if (resources.size() >= 8) {
                articleImage.setResource7(Objects.nonNull(articleImageDTO.getResources().get(7)) ? articleImageDTO.getResources().get(7) : null);
            }
            if (resources.size() >= 9) {
                articleImage.setResource8(Objects.nonNull(articleImageDTO.getResources().get(8)) ? articleImageDTO.getResources().get(8) : null);
            }
            if (resources.size() >= 10) {
                articleImage.setResource9(Objects.nonNull(articleImageDTO.getResources().get(9)) ? articleImageDTO.getResources().get(9) : null);
            }
        }
        return articleImage;
    }

}
