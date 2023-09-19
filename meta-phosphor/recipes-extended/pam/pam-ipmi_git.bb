SUMMARY = "PAM modules for IPMI support"
DESCRIPTION = "PAM modules managing password for IPMI"
HOMEPAGE = "http://github.com/openbmc/pam-ipmi"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS += "openssl libpam"
SRCREV = "ed6737638025da13dbb5be4314627d0d5bcce6a5"
PV = "1.0+git${SRCPV}"
PR = "r1"

SRC_URI = "git://github.com/openbmc/pam-ipmi;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit meson pkgconfig

FILES:${PN} += " \
               ${base_libdir}/security/ \
               ${sysconfdir}/key_file \
               ${sysconfdir}/ipmi_pass \
               "
