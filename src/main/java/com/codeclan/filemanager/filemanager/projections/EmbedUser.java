package com.codeclan.filemanager.filemanager.projections;

import com.codeclan.filemanager.filemanager.models.File;
import com.codeclan.filemanager.filemanager.models.Folder;
import com.codeclan.filemanager.filemanager.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    List<File> getFiles();
    User getUser();
}
