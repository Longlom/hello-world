# Auto-Generated by cargo-bitbake 0.3.15
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get test-rust could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/test-rust/0.1.0"
SRC_URI += "git://git@github.com/Longlom/hello-world.git;protocol=ssh;nobranch=1"
SRCREV = "98c2f28333e97416282e6852fd0c5fcdf55d40d4"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV_append = ".AUTOINC+98c2f28333"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "test-rust"
HOMEPAGE = "https://github.com/Longlom/hello-world"
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include test-rust-${PV}.inc
include test-rust.inc
