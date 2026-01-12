# Contributing to Velora Suites

Thank you for your interest in contributing to Velora Suites!

## How to Contribute

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b my-branch-name
   ```
3. Commit your changes with descriptive messages:
   ```bash
   git commit -m "Add some feature"
   ```
4. Push to your fork:
   ```bash
   git push origin my-branch-name
   ```
5. Open a pull request against the `main` branch.

## Code Style

This project adheres to the coding conventions defined in the [.editorconfig](.editorconfig) and the Checkstyle configuration defined in [checkstyle.xml](checkstyle.xml). To validate formatting and style, run:

```bash
java -jar checkstyle-8.45-all.jar -c checkstyle.xml src/
```

## Reporting Issues

If you discover a bug or want to request a feature, please open an issue first to discuss it.
