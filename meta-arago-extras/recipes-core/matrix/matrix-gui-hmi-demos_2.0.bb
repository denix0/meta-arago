SUMMARY = "HMI demo descriptions for Matrix v2"

require recipes-core/matrix/matrix-gui-apps-git.inc

PR = "${INC_PR}.0"

inherit allarch

S = "${WORKDIR}/git/hmi_apps"

# Make sure machinevision submenu and app images has been installed
HMI_RDEPENDS += "matrix-gui-apps-images matrix-gui-submenus-hmi"

FILES:${PN} += "${MATRIX_BASE_DIR}/*"

PACKAGES = "matrix-hmi-demo-evse \
	    matrix-hmi-demo-protection-relays \
	    matrix-hmi-demo-mmwavegesture \
"

RDEPENDS:matrix-hmi-demo-evse = " \
    bash \
    ${HMI_RDEPENDS} \
    evse-hmi \
"

RDEPENDS:matrix-hmi-demo-protection-relays = " \
    bash \
    ${HMI_RDEPENDS} \
    protection-relays-hmi \
"

RDEPENDS:matrix-hmi-demo-mmwavegesture = " \
    bash \
    ${HMI_RDEPENDS} \
    mmwavegesture-hmi \
"

FILES:matrix-hmi-demo-evse    = "${MATRIX_APP_DIR}/hmi_evse/*"
FILES:matrix-hmi-demo-evse  += "${bindir}/runHmiEvse.sh"

FILES:matrix-hmi-demo-protection-relays   = "${MATRIX_APP_DIR}/hmi_protection_relays/*"
FILES:matrix-hmi-demo-protection-relays  += "${bindir}/runHmiProtectionRelays.sh"

FILES:matrix-hmi-demo-mmwavegesture    = "${MATRIX_APP_DIR}/hmi_mmwave/*"
FILES:matrix-hmi-demo-mmwavegesture  += "${bindir}/runHmiMmWave.sh"
