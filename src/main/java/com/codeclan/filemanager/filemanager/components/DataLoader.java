package com.codeclan.filemanager.filemanager.components;

import com.codeclan.filemanager.filemanager.models.File;
import com.codeclan.filemanager.filemanager.models.Folder;
import com.codeclan.filemanager.filemanager.models.User;
import com.codeclan.filemanager.filemanager.repositories.FileRepository;
import com.codeclan.filemanager.filemanager.repositories.FolderRepository;
import com.codeclan.filemanager.filemanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Katharina");
        userRepository.save(user1);

        Folder folder1 = new Folder("All files", user1);
        folderRepository.save(folder1);

        File file1 = new File("Secret", "doc", 12, folder1);
        fileRepository.save(file1);

        folder1.addFile(file1);
        folderRepository.save(folder1);

        user1.addFolder(folder1);
        userRepository.save(user1);

    }
}
