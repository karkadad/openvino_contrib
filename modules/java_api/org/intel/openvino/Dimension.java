// Copyright (C) 2020-2022 Intel Corporation
// SPDX-License-Identifier: Apache-2.0

package org.intel.openvino;

public class Dimension extends Wrapper {
    protected Dimension(long addr) {
        super(addr);
    }

    public int get_length() {
        return getLength(nativeObj);
    }

    /*----------------------------------- native methods -----------------------------------*/
    private static native int getLength(long addr);

    @Override
    protected native void delete(long nativeObj);
}
