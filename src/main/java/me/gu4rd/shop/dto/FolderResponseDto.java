package me.gu4rd.shop.dto;

import lombok.Getter;
import me.gu4rd.shop.entity.Folder;

@Getter
public class FolderResponseDto {
    private Long id;
    private String name;

    public FolderResponseDto(Folder folder) {
        this.id = folder.getId();
        this.name = folder.getName();
    }
}