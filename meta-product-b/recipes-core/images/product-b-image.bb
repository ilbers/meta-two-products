# Root filesystem for target installation
#
# This software is a part of ISAR.
# Copyright (C) 2015-2016 ilbers GmbH

DESCRIPTION = "Multistrap target filesystem for product B"

include recipes-core/images/isar-image-base.bb

IMAGE_PREINSTALL      += "        \
                          apache2 \
                         "
