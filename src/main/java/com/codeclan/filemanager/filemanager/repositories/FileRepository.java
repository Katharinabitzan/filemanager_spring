package com.codeclan.filemanager.filemanager.repositories;

import com.codeclan.filemanager.filemanager.models.File;
import com.codeclan.filemanager.filemanager.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
