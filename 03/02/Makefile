output_dir = bin
# wildcard function to get all source .java files
sources = $(wildcard *.java)
# prepend output directory to all source files to get corresponding .class files
classes = $(addprefix $(output_dir)/,$(sources:.java=.class))

all: version run

# Target to compile all sources
# If a source file is newer than the corresponding class file, everything will be recompiled
# compile inside the output directory with -d flag 
$(classes): $(sources)
	mkdir -p $(output_dir)
	javac -d $(output_dir) $(sources)

# Run target depends on compiled classes
run: $(classes)
	java -cp $(output_dir) Main

# Cleanup all java class files
clean:
	rm -rf $(output_dir)

version:
	java -version

# Declare non-file targets, good practice
# https://www.gnu.org/software/make/manual/html_node/Phony-Targets.html
.PHONY: all run clean version
