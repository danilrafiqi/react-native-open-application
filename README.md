
# react-native-open-application

[![Platform](https://img.shields.io/badge/platform-react--native-lightgrey.svg)](http://facebook.github.io/react-native/)
[![Version](http://img.shields.io/npm/v/react-native-open-application.svg)](https://www.npmjs.com/package/react-native-open-application)
[![Download](http://img.shields.io/npm/dm/react-native-open-application.svg)](https://www.npmjs.com/package/react-native-open-application)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.github.com/danilrafiqi/react-native-open-application/master/LICENSE)

This package is support by [daridasar.com](https://daridasar.com)

React Native module to open other application.

- Work for android
- Support typescript

## Table of contents

1. [Installation](#installation)
2. [Usage](#usage)

## Installation

If using yarn:

```
yarn add react-native-open-application
```

If using npm:

```
npm i react-native-open-application
```

## Usage

```javascript
import React from "react";
import { View, Text } from "react-native";
import OpenApplication from 'react-native-open-application';

const App = () => {
  return (
	<TouchableOpacity
		onPress={() => {
			OpenApplication.openApplication('com.your.app');
		}}
	>
		<Text>Your App</Text>
	</TouchableOpacity>
  );
};

export default App;
```