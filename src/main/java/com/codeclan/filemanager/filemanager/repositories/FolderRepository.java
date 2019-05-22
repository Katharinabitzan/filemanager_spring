package com.codeclan.filemanager.filemanager.repositories;

import com.codeclan.filemanager.filemanager.models.Folder;
import com.codeclan.filemanager.filemanager.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
