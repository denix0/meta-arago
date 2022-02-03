DESCRIPTION = "Host packages for Qt Embedded SDK"
PR = "r10"
LICENSE = "MIT"

inherit packagegroup nativesdk

RDEPENDS_${PN} = "\
    nativesdk-packagegroup-arago-tisdk-host \
    nativesdk-qtbase \
    nativesdk-qttools \
    "
