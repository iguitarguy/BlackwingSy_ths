package model;

import java.io.File;
import java.util.ArrayList;

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

        String OS = System.getProperty("os.name");
        if ( OS.startsWith("Windows") ) {

            windowsFiles();
        }
        else {

            unixFiles();
        }
    }

    private void unixFiles() throws Exception {

        String[] hat = new String[] {
                "/bin/Composite/Drums/Hat/Hat (1).mp3",
                "/bin/Composite/Drums/Hat/Hat (2).mp3",
                "/bin/Composite/Drums/Hat/Hat (3).mp3",
                "/bin/Composite/Drums/Hat/Hat (4).mp3",
                "/bin/Composite/Drums/Hat/Hat (5).mp3",
                "/bin/Composite/Drums/Hat/Hat (6).mp3",
                "/bin/Composite/Drums/Hat/Hat (7).mp3",
                "/bin/Composite/Drums/Hat/Hat (8).mp3",
                "/bin/Composite/Drums/Hat/Hat (9).mp3",
                "/bin/Composite/Drums/Hat/Hat (10).mp3"
        };
        String[] kick = new String[] {
                "/bin/Composite/Drums/Kick/Kick (1).mp3",
                "/bin/Composite/Drums/Kick/Kick (2).mp3",
                "/bin/Composite/Drums/Kick/Kick (3).mp3",
                "/bin/Composite/Drums/Kick/Kick (4).mp3",
                "/bin/Composite/Drums/Kick/Kick (5).mp3",
                "/bin/Composite/Drums/Kick/Kick (6).mp3",
                "/bin/Composite/Drums/Kick/Kick (7).mp3",
                "/bin/Composite/Drums/Kick/Kick (8).mp3",
                "/bin/Composite/Drums/Kick/Kick (9).mp3",
                "/bin/Composite/Drums/Kick/Kick (10).mp3",
                "/bin/Composite/Drums/Kick/Kick (11).mp3",
                "/bin/Composite/Drums/Kick/Kick (12).mp3",
                "/bin/Composite/Drums/Kick/Kick (13).mp3",
                "/bin/Composite/Drums/Kick/Kick (14).mp3"
        };
        String[] snare = new String[] {
                "/bin/Composite/Drums/Snare/AcousticSnare (1).mp3",
                "/bin/Composite/Drums/Snare/AcousticSnare (2).mp3",
                "/bin/Composite/Drums/Snare/AcousticSnare (3).mp3",
                "/bin/Composite/Drums/Snare/AcousticSnare (4).mp3",
                "/bin/Composite/Drums/Snare/AcousticSnare (5).mp3",
                "/bin/Composite/Drums/Snare/AcousticSnare (6).mp3",
                "/bin/Composite/Drums/Snare/AcousticSnare (7).mp3",
                "/bin/Composite/Drums/Snare/AcousticSnare (8).mp3",
                "/bin/Composite/Drums/Snare/AcousticSnare (9).mp3",
                "/bin/Composite/Drums/Snare/Roll.mp3",
                "/bin/Composite/Drums/Snare/Snare (1).mp3",
                "/bin/Composite/Drums/Snare/Snare (2).mp3",
                "/bin/Composite/Drums/Snare/SynthSnare (1).mp3",
                "/bin/Composite/Drums/Snare/SynthSnare (2).mp3",
                "/bin/Composite/Drums/Snare/SynthSnare (3).mp3",
                "/bin/Composite/Drums/Snare/SynthSnare (4).mp3",
                "/bin/Composite/Drums/Snare/SynthSnare (5).mp3",
                "/bin/Composite/Drums/Snare/SynthSnare (6).mp3",
                "/bin/Composite/Drums/Snare/SynthSnare (7).mp3"
        };
        String[] bLoop = new String[] {
                "/bin/Composite/Loops/Bass/BassLoop (1).mp3",
                "/bin/Composite/Loops/Bass/BassLoop (2).mp3",
                "/bin/Composite/Loops/Bass/BassLoop (3).mp3"
        };
        String[] dLoop = new String[] {
                "/bin/Composite/Loops/Drum/DrumLoop (1).mp3",
                "/bin/Composite/Loops/Drum/DrumLoop (2).mp3",
                "/bin/Composite/Loops/Drum/DrumLoop (3).mp3",
                "/bin/Composite/Loops/Drum/DrumLoop (4).mp3",
                "/bin/Composite/Loops/Drum/DrumPad (1).mp3",
                "/bin/Composite/Loops/Drum/DrumPad (2).mp3",
                "/bin/Composite/Loops/Drum/DrumPad (3).mp3",
                "/bin/Composite/Loops/Drum/DrumPad (4).mp3"
        };
        String[] pLoop = new String[] {
                "/bin/Composite/Loops/Piano/Piano (1).mp3",
                "/bin/Composite/Loops/Piano/Piano (5).mp3",
                "/bin/Composite/Loops/Piano/Piano (6).mp3",
                "/bin/Composite/Loops/Piano/Piano (7).mp3"
        };
        String[] sfx = new String[] {
                "/bin/Composite/SFX/Beat.mp3",
                "/bin/Composite/SFX/Clap (1).mp3",
                "/bin/Composite/SFX/Clap (2).mp3",
                "/bin/Composite/SFX/Increase (1).mp3",
                "/bin/Composite/SFX/Increase (2).mp3",
                "/bin/Composite/SFX/Long.mp3",
                "/bin/Composite/SFX/Noise.mp3",
                "/bin/Composite/SFX/Organ.mp3",
                "/bin/Composite/SFX/Short.mp3",
                "/bin/Composite/SFX/Staccato.mp3"
        };
        String[] vocal = new String[] {
                "/bin/Composite/Vocals/PayAttention.mp3",
                "/bin/Composite/Vocals/Rrrah.mp3"
        };

        createLists(hat, kick, snare, bLoop, dLoop, pLoop, sfx, vocal);
    }

    private void windowsFiles() throws Exception {

        String[] hat = new String[] {
                "\\bin\\Composite\\Drums\\Hat\\Hat (1).mp3",
                "\\bin\\Composite\\Drums\\Hat\\Hat (2).mp3",
                "\\bin\\Composite\\Drums\\Hat\\Hat (3).mp3",
                "\\bin\\Composite\\Drums\\Hat\\Hat (4).mp3",
                "\\bin\\Composite\\Drums\\Hat\\Hat (5).mp3",
                "\\bin\\Composite\\Drums\\Hat\\Hat (6).mp3",
                "\\bin\\Composite\\Drums\\Hat\\Hat (7).mp3",
                "\\bin\\Composite\\Drums\\Hat\\Hat (8).mp3",
                "\\bin\\Composite\\Drums\\Hat\\Hat (9).mp3",
                "\\bin\\Composite\\Drums\\Hat\\Hat (10).mp3"
        };
        String[] kick = new String[] {
                "\\bin\\Composite\\Drums\\Kick\\Kick (1).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (2).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (3).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (4).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (5).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (6).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (7).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (8).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (9).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (10).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (11).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (12).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (13).mp3",
                "\\bin\\Composite\\Drums\\Kick\\Kick (14).mp3"
        };
        String[] snare = new String[] {
                "\\bin\\Composite\\Drums\\Snare\\AcousticSnare (1).mp3",
                "\\bin\\Composite\\Drums\\Snare\\AcousticSnare (2).mp3",
                "\\bin\\Composite\\Drums\\Snare\\AcousticSnare (3).mp3",
                "\\bin\\Composite\\Drums\\Snare\\AcousticSnare (4).mp3",
                "\\bin\\Composite\\Drums\\Snare\\AcousticSnare (5).mp3",
                "\\bin\\Composite\\Drums\\Snare\\AcousticSnare (6).mp3",
                "\\bin\\Composite\\Drums\\Snare\\AcousticSnare (7).mp3",
                "\\bin\\Composite\\Drums\\Snare\\AcousticSnare (8).mp3",
                "\\bin\\Composite\\Drums\\Snare\\AcousticSnare (9).mp3",
                "\\bin\\Composite\\Drums\\Snare\\Roll.mp3",
                "\\bin\\Composite\\Drums\\Snare\\Snare (1).mp3",
                "\\bin\\Composite\\Drums\\Snare\\Snare (2).mp3",
                "\\bin\\Composite\\Drums\\Snare\\SynthSnare (1).mp3",
                "\\bin\\Composite\\Drums\\Snare\\SynthSnare (2).mp3",
                "\\bin\\Composite\\Drums\\Snare\\SynthSnare (3).mp3",
                "\\bin\\Composite\\Drums\\Snare\\SynthSnare (4).mp3",
                "\\bin\\Composite\\Drums\\Snare\\SynthSnare (5).mp3",
                "\\bin\\Composite\\Drums\\Snare\\SynthSnare (6).mp3",
                "\\bin\\Composite\\Drums\\Snare\\SynthSnare (7).mp3"
        };
        String[] bLoop = new String[] {
                "\\bin\\Composite\\Loops\\Bass\\BassLoop (1).mp3",
                "\\bin\\Composite\\Loops\\Bass\\BassLoop (2).mp3",
                "\\bin\\Composite\\Loops\\Bass\\BassLoop (3).mp3"
        };
        String[] dLoop = new String[] {
                "\\bin\\Composite\\Loops\\Drum\\DrumLoop (1).mp3",
                "\\bin\\Composite\\Loops\\Drum\\DrumLoop (2).mp3",
                "\\bin\\Composite\\Loops\\Drum\\DrumLoop (3).mp3",
                "\\bin\\Composite\\Loops\\Drum\\DrumLoop (4).mp3",
                "\\bin\\Composite\\Loops\\Drum\\DrumPad (1).mp3",
                "\\bin\\Composite\\Loops\\Drum\\DrumPad (2).mp3",
                "\\bin\\Composite\\Loops\\Drum\\DrumPad (3).mp3",
                "\\bin\\Composite\\Loops\\Drum\\DrumPad (4).mp3"
        };
        String[] pLoop = new String[] {
                "\\bin\\Composite\\Loops\\Piano\\Piano (1).mp3",
                "\\bin\\Composite\\Loops\\Piano\\Piano (5).mp3",
                "\\bin\\Composite\\Loops\\Piano\\Piano (6).mp3",
                "\\bin\\Composite\\Loops\\Piano\\Piano (7).mp3"
        };
        String[] sfx = new String[] {
                "\\bin\\Composite\\SFX\\Beat.mp3",
                "\\bin\\Composite\\SFX\\Clap (1).mp3",
                "\\bin\\Composite\\SFX\\Clap (2).mp3",
                "\\bin\\Composite\\SFX\\Increase (1).mp3",
                "\\bin\\Composite\\SFX\\Increase (2).mp3",
                "\\bin\\Composite\\SFX\\Long.mp3",
                "\\bin\\Composite\\SFX\\Noise.mp3",
                "\\bin\\Composite\\SFX\\Organ.mp3",
                "\\bin\\Composite\\SFX\\Short.mp3",
                "\\bin\\Composite\\SFX\\Staccato.mp3"
        };
        String[] vocal = new String[] {
                "\\bin\\Composite\\Vocals\\PayAttention.mp3",
                "\\bin\\Composite\\Vocals\\Rrrah.mp3"
        };

        createLists(hat, kick, snare, bLoop, dLoop, pLoop, sfx, vocal);
    }

    private void createLists( String[] hat, String[] kick, String[] snare, String[] bLoop, String[] dLoop, String[] pLoop, String[] sfx, String[] vocal ) throws Exception {

        for ( int i = 0; i < hat.length; i++ ) {

            hatP.add(getClass().getResource(hat[ i ]).toURI().toString());
            allP.add(getClass().getResource(hat[ i ]).toURI().toString());
        }
        for ( int i = 0; i < kick.length; i++ ) {

            kickP.add(getClass().getResource(kick[ i ]).toURI().toString());
            allP.add(getClass().getResource(kick[ i ]).toURI().toString());
        }
        for ( int i = 0; i < snare.length; i++ ) {

            snareP.add(getClass().getResource(snare[ i ]).toURI().toString());
            allP.add(getClass().getResource(snare[ i ]).toURI().toString());
        }
        for ( int i = 0; i < bLoop.length; i++ ) {

            bLoopP.add(getClass().getResource(bLoop[ i ]).toURI().toString());
            allP.add(getClass().getResource(bLoop[ i ]).toURI().toString());
        }
        for ( int i = 0; i < dLoop.length; i++ ) {

            dLoopP.add(getClass().getResource(dLoop[ i ]).toURI().toString());
            allP.add(getClass().getResource(dLoop[ i ]).toURI().toString());
        }
        for ( int i = 0; i < pLoop.length; i++ ) {

            pLoopP.add(getClass().getResource(pLoop[ i ]).toURI().toString());
            allP.add(getClass().getResource(pLoop[ i ]).toURI().toString());
        }
        for ( int i = 0; i < sfx.length; i++ ) {

            sfxP.add(getClass().getResource(sfx[ i ]).toURI().toString());
            allP.add(getClass().getResource(sfx[ i ]).toURI().toString());
        }
        for ( int i = 0; i < vocal.length; i++ ) {

            vocalP.add(getClass().getResource(vocal[ i ]).toURI().toString());
            allP.add(getClass().getResource(vocal[ i ]).toURI().toString());
        }
    }

}
