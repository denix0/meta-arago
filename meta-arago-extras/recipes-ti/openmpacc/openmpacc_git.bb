DESCRIPTION = "TI OpenMP-Acc host runtime and development packages"

include openmpacc.inc

PR = "${INC_PR}.1"

inherit cmake

DEPENDS = "boost boost-native opencl"
RDEPENDS:${PN} += "opencl-runtime"
RDEPENDS:${PN}-dev += "clacc"

S = "${WORKDIR}/git/host"

export TARGET_ROOTDIR = "${STAGING_DIR_HOST}"
export LINUX_DEVKIT_ROOT = "${STAGING_DIR_HOST}"

EXTRA_OECMAKE += "-DVERSION="${PV}" -DBUILD_OUTPUT=lib"

FILES:${PN} += "/usr/share/ti/openmpacc/*"
