package com.codeclan.filemanager.filemanager.projections;

import com.codeclan.filemanager.filemanager.models.File;
import com.codeclan.filemanager.filemanager.models.Folder;
import com.codeclan.filemanager.filemanager.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
