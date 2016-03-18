How to use the source code:
--------------------------


1. Set up JDK, Forge and eclipse the default way, as described in this Wuppy's
    tutorial: http://youtu.be/W9OT9NTbsf0

2. Clone the source code repository any place convenient (which will create a
    minecraft-poutinemod wherever you clone it)
        - example: hg clone https://timtoo@bitbucket.org/timtoo/minecraft-poutinemod

3. In eclipse, right click on MDKExample and select "Import..."
        - "Browse..." to find/select the minecraft-poutinemod folder that
          was cloned in step 2
        - Click "Select All" or (more precisely) open the "minecraft-poutinemod"
          tree that should have appeared, and click beside just "main" so a
          checkmark appears. This is the only folder needed.
        - "Into folder" MDKExample/src/
        - Click "Advanced >>"
        - Click "Create links in workspace" (so your source code clone
          stays where it is, but is accessable in eclipse)
        - Click "Finish"
        - Click "Yes" when asked to overwrite mcmod.info
        - You now should see "ca.vaults.minecraft.poutine" under
          "src/main/java" in your eclipse package explorer.

4. Edit the forge build.gradle file as desribed below.

5. You can delete com.example.examplemod package in exclipse, if you want to


The above steps brings the minecraft-poutinemod source code into eclipse (into
the MDKExample project) while leaving it physically in the place you cloned
the repository. If you are going to use the version control, it should be done
in this original location, to avoid confusion.

The source code provided is the everything that would go under the "src" directory
of a minecraft forge eclipse project set up as described by the Minecraft Forge
documentation. It uses **gradle** to build the jar file.

You will have to edit the *build.gradle* file (in your forge source
directory) with the following (or similar) information:

    version = "1.8.9-1.0"
    group= "ca.xxvii.minecraft.poutinemod"
    archivesBaseName = "PoutineMod"


