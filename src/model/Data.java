package model;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Data {

    public ArrayList< String > hatP;
    public ArrayList< String > kickP;
    public ArrayList< String > snareP;
    public ArrayList< String > bLoopP;
    public ArrayList< String > dLoopP;
    public ArrayList< String > pLoopP;
    public ArrayList< String > sfxP;
    public ArrayList< String > vocalP;
    public ArrayList< String > allP;

    public Data() throws Exception {

        hatP = new ArrayList<>();
        kickP = new ArrayList<>();
        snareP = new ArrayList<>();
        bLoopP = new ArrayList<>();
        dLoopP = new ArrayList<>();
        pLoopP = new ArrayList<>();
        sfxP = new ArrayList<>();
        vocalP = new ArrayList<>();
        allP = new ArrayList<>();

        String workingDir = "";
        String OS = System.getProperty("os.name").toLowerCase();
        if ( OS.startsWith("windows") ) {

            workingDir = System.getenv("AppData");
        }
        else {

            workingDir = System.getProperty("user.home");

            if ( OS.startsWith("mac os") ) {

                workingDir += "/Library/Application Support";
            }
        }

        Path path = FileSystems.getDefault().getPath(workingDir + File.separatorChar + ".blackwing");

        if ( !new File(path.toUri()).exists() ) {

            Files.createDirectory(path);
            outputFiles(path);
        }

        Path musicPath = FileSystems.getDefault().getPath(path.toString() + File.separatorChar + "bin" + File.separatorChar + "Composite");
        readFiles(musicPath, "Drums" + File.separatorChar + "Hat", hatP);
        readFiles(musicPath, "Drums" + File.separatorChar + "Kick", kickP);
        readFiles(musicPath, "Drums" + File.separatorChar + "Snare", snareP);
        readFiles(musicPath, "Loops" + File.separatorChar + "Bass", bLoopP);
        readFiles(musicPath, "Loops" + File.separatorChar + "Drum", dLoopP);
        readFiles(musicPath, "Loops" + File.separatorChar + "Piano", pLoopP);
        readFiles(musicPath, "SFX", sfxP);
        readFiles(musicPath, "Vocals", vocalP);
        readFiles(musicPath, "", allP);

    }

    public void outputFiles( Path workingDir ) {

        try {

            final File jarFile = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());

            if ( jarFile.isFile() ) {

                final JarFile jar = new JarFile(jarFile);
                final Enumeration< JarEntry > entries = jar.entries();
                while ( entries.hasMoreElements() ) {
                    final JarEntry je = entries.nextElement();
                    if ( je.getName().startsWith("bin") ) {
                        if ( je.getName().contains(".") ) {
                            InputStream is = jar.getInputStream(je);
                            byte[] buf = new byte[ 2048 ];
                            int nbRead;
                            File currentFile = new File(workingDir.toString() + File.separatorChar + je.getName());
                            OutputStream os = new BufferedOutputStream(new FileOutputStream(currentFile));
                            while ( ( nbRead = is.read(buf) ) != -1 ) {
                                os.write(buf, 0, nbRead);
                            }
                            os.flush();
                            os.close();
                        }
                        else {

                            if ( !new File(workingDir.toString() + File.separatorChar + je.getName()).exists() ) {

                                Files.createDirectory(FileSystems.getDefault().getPath(workingDir.toString() + File.separatorChar + je.getName()));
                            }
                        }
                    }
                }
            }
        }
        catch ( FileNotFoundException fnf ) {
            fnf.printStackTrace();
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    private void readFiles( Path path, String dir, ArrayList< String > al ) throws Exception {
        Files.walk(FileSystems.getDefault().getPath(path.toString() + File.separatorChar + dir)).forEach(filePath -> {
            if ( Files.isRegularFile(filePath) ) {
                al.add(filePath.toString());
            }
        });
    }
}
