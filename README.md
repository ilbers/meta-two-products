This is an example layer using Isar.

It implements two products as follows:
 - Product A images for the `qemuarm` and `rpi` machines.
 - Product B image for the `qemuarm` machine.
 - Both products have a common `hello` package.

# Preparation

Check out `isar`:

        $ git clone http://github.com/ilbers/isar.git

Check out this example:

        $ cd isar
        $ git clone http://github.com/ilbers/meta-two-products.git

Edit the template file to use configuration from example layer:

        $ vi .templateconf

Modify `TEMPLATECONF` as follows:

        TEMPLATECONF=${TEMPLATECONF:-meta-two-products/meta-common/conf}

Initialize the build directory:

        $ . isar-init-build-env ../build

# Build

To build all product images, run the following command:

        $ bitbake multiconfig:qemuarm:product-a-image multiconfig:rpi:product-a-image multiconfig:qemuarm:product-b-image

# Deploy

After the build is complete, the following images are provided:

        tmp/deploy/images/product-a-image-qemuarm.ext4.img
        tmp/deploy/images/product-a-image-rpi.rpi-sdimg
        tmp/deploy/images/product-b-image-qemuarm.ext4.img
